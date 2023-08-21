package com.villo.sortify.converter.toDto;

import com.villo.sortify.dto.response.PlayListResponseDTO.ItemPlayListResponseDTO;
import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.dto.response.PlayListResponseDTO.ImagePlayListResponseDTO;
import com.villo.sortify.sto.response.PlayListResponseSTO;
import org.springframework.stereotype.Component;


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
}
