package com.anil.product.service.grpc;

import com.anil.grpc.DiscountRequest;
import com.anil.grpc.DiscountResponse;

public interface DiscountGrpcService {
    DiscountResponse getDiscount(DiscountRequest discountRequest);
}
