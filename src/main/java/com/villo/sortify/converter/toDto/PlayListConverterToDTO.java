package com.villo.sortify.converter.toDto;

import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.sto.response.ItemsResponseSTO;
import com.villo.sortify.sto.response.PlayListResponseSTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayListConverterToDTO {
    public List<PlayListResponseDTO> playListResponseFromPlayListResponseSTO(PlayListResponseSTO playListResponseSTO) {
        List<PlayListResponseDTO> result = new ArrayList<>();
        for (ItemsResponseSTO x : playListResponseSTO.getItems()) {
            result.add(PlayListResponseDTO.builder().name(x.getName()).build());
        }

        return result;
    }
}
