package com.japaneselearning.common.response;

public record PaginationMeta(
        int page,
        int size,
        long totalElements,
        int totalPages
) {
}