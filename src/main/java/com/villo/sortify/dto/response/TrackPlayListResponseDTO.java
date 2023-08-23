package com.villo.sortify.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrackPlayListResponseDTO {
    private List<ItemTrackPlayListResponseDTO> items = new ArrayList<>();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class ItemTrackPlayListResponseDTO {
        private String trackName;
        private LocalDateTime addedAt;
        private String albumName;
        private String artistName;
        private String duration;
        private int popularity;
        private LocalDate releaseDate;
    }
}
