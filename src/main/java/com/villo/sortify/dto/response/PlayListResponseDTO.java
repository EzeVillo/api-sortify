package com.villo.sortify.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayListResponseDTO {
    private List<ItemPlayListResponseDTO> items = new ArrayList<>();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ItemPlayListResponseDTO {
        private String name;
        private String description;
        private String id;
        private ImagePlayListResponseDTO images;
        private int total;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ImagePlayListResponseDTO {
        private int height;
        private String url;
        private int width;
    }
}
