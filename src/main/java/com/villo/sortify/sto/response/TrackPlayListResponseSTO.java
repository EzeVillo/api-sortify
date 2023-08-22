package com.villo.sortify.sto.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackPlayListResponseSTO {
    private List<ItemTrackPlayListResponseSTO> items = new ArrayList<>();

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class ItemTrackPlayListResponseSTO {
        private TrackTrackPlayListResponseSTO track;
        private LocalDateTime addedAt;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class TrackTrackPlayListResponseSTO {
        private String name;
        private AlbumTrackPlayListResponseSTO album;
        private List<ArtistTrackPlayListResponseSTO> artists;
        private int durationMs;
        private int popularity;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class AlbumTrackPlayListResponseSTO {
        private String name;
        private LocalDate releaseDate;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ArtistTrackPlayListResponseSTO {
        private String name;
    }
}
