package com.villo.sortify.converter.toDto;

import com.villo.sortify.dto.response.PlayListResponseDTO.ItemPlayListResponseDTO;
import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.dto.response.PlayListResponseDTO.ImagePlayListResponseDTO;
import com.villo.sortify.dto.response.TrackPlayListResponseDTO;
import com.villo.sortify.dto.response.TrackPlayListResponseDTO.ItemTrackPlayListResponseDTO;
import com.villo.sortify.sto.response.PlayListResponseSTO;
import com.villo.sortify.sto.response.TrackPlayListResponseSTO;
import org.springframework.stereotype.Component;
import util.FormatDateUtils;


@Component
public class PlayListConverterToDTO {
    public PlayListResponseDTO playListResponseFromPlayListResponseSTO(final PlayListResponseSTO playListResponseSTO) {
        return new PlayListResponseDTO(playListResponseSTO
                .getItems()
                .stream()
                .map(item -> ItemPlayListResponseDTO.builder()
                        .id(item.getId())
                        .description(item.getDescription())
                        .images(ImagePlayListResponseDTO.builder()
                                .height(item.getImages().get(0).getHeight())
                                .url(item.getImages().get(0).getUrl())
                                .width(item.getImages().get(0).getWidth()).build())
                        .name(item.getName())
                        .total(item.getTracks().getTotal())
                        .build()).toList());
    }

    public TrackPlayListResponseDTO trackPlayListResponseFromTrackPlayListResponseDTO(final TrackPlayListResponseSTO trackPlayListResponseSTO) {
        return TrackPlayListResponseDTO.builder()
                .items(trackPlayListResponseSTO
                        .getItems()
                        .stream()
                        .map(item -> ItemTrackPlayListResponseDTO.builder()
                                .addedAt(item.getAddedAt())
                                .albumName(item.getTrack().getAlbum().getName())
                                .artistName(item.getTrack().getArtists().get(0).getName())
                                .duration(FormatDateUtils.minutesFromMS(item.getTrack().getDurationMs()))
                                .trackName(item.getTrack().getName())
                                .popularity(item.getTrack().getPopularity())
                                .releaseDate(item.getTrack().getAlbum().getReleaseDate())
                                .build()).toList()).build();
    }
}
