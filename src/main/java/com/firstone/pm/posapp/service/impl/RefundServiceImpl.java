package com.firstone.pm.posapp.service.impl;

import com.firstone.pm.posapp.mapper.RefundMapper;
import com.firstone.pm.posapp.model.Branch;
import com.firstone.pm.posapp.model.Order;
import com.firstone.pm.posapp.model.Refund;
import com.firstone.pm.posapp.model.User;
import com.firstone.pm.posapp.payload.dto.RefundDTO;
import com.firstone.pm.posapp.repository.OrderRepository;
import com.firstone.pm.posapp.repository.RefundRepository;
import com.firstone.pm.posapp.service.RefundService;
import com.firstone.pm.posapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RefundServiceImpl implements RefundService {

    private final UserService userService;

    private final RefundRepository refundRepository;
    private final OrderRepository orderRepository;

    @Override
    public RefundDTO createRefund(RefundDTO refundDTO) throws Exception {
        User cashier = userService.getCurrentUser();
        Order order = orderRepository.findById(refundDTO.getOrderId())
                .orElseThrow(() -> new Exception("Order does not found"));

        Branch branch = order.getBranch();
        Refund createdRefund = Refund.builder()
                .order(order)
                .cashier(cashier)
                .branch(branch)
                .reason(refundDTO.getReason())
                .amount(refundDTO.getAmount())
                .createdAt(refundDTO.getCreatedAt())
                .build();

        Refund savedRefund = refundRepository.save(createdRefund);
        return RefundMapper.toDTO(savedRefund);
    }

    @Override
    public List<RefundDTO> getAllRefunds() throws Exception {
        return refundRepository.findAll().stream()
                .map(RefundMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<RefundDTO> getRefundByCashierId(Long cashierId) throws Exception {
        return refundRepository.findByCashierId(cashierId).stream()
                .map(RefundMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<RefundDTO> getRefundByShiftReportId(Long shiftRefundId) throws Exception {
        return refundRepository.findByShiftReportId(shiftRefundId).stream()
                .map(RefundMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<RefundDTO> getRefundsByCashierAndDateRange(Long cashierId,
                                                           LocalDateTime startDate,
                                                           LocalDateTime endDate) throws Exception {
        return refundRepository.findByCashierIdAndCreatedAtBetween(
                cashierId,
                startDate,
                endDate
        ).stream().map(RefundMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public List<RefundDTO> getRefundsByBranchId(Long branchId) throws Exception {
        return refundRepository.findByBranchId(branchId).stream()
                .map(RefundMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RefundDTO getRefundById(Long refundId) throws Exception {
        return refundRepository.findById(refundId).map(RefundMapper::toDTO)
                .orElseThrow(() -> new Exception("Refund does not found"));
    }

    @Override
    public void deleteRefundById(Long refundId) throws Exception {
        this.getRefundById(refundId);
        refundRepository.deleteById(refundId);
    }
}
