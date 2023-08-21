package com.villo.sortify.sto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayListResponseSTO {
    private List<ItemPlayListResponseSTO> items;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ItemPlayListResponseSTO {
        private String name;
        private String description;
        private String id;
        private List<ImagePlayListResponseSTO> images;
        private TrackPlayListResponseSTO tracks;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ImagePlayListResponseSTO {
        private int height;
        private String url;
        private int width;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TrackPlayListResponseSTO {
        private int total;
    }
}

