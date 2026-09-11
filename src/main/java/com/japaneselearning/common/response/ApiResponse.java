package com.japaneselearning.common.response;

public record ApiResponse<T>(
        boolean success,
        T data,
        ErrorResponse error,
        ResponseMeta meta,
        PaginationMeta pagination
) {

    public static <T> ApiResponse<T> success(
            T data,
            ResponseMeta meta
    ) {
        return new ApiResponse<>(
                true,
                data,
                null,
                meta,
                null
        );
    }

    public static <T> ApiResponse<T> success(
            T data,
            ResponseMeta meta,
            PaginationMeta pagination
    ) {
        return new ApiResponse<>(
                true,
                data,
                null,
                meta,
                pagination
        );
    }

    public static <T> ApiResponse<T> error(
            ErrorResponse error,
            ResponseMeta meta
    ) {
        return new ApiResponse<>(
                false,
                null,
                error,
                meta,
                null
        );
    }
}