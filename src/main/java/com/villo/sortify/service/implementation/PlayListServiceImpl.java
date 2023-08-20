package com.villo.sortify.service.implementation;

import com.villo.sortify.converter.toDto.PlayListConverterToDTO;
import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.integration.SpotifyApiClient;
import com.villo.sortify.service.PlayListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayListServiceImpl implements PlayListService {
    final private SpotifyApiClient spotifyApiClient;
    final private PlayListConverterToDTO playListConverterToDTO;

    @Override
    public List<PlayListResponseDTO> getPlayListsFromLoggedUser(final String auth) {
        return this.playListConverterToDTO.PlayListToListDTO(this.spotifyApiClient.getPlayListsFromLoggedUser(auth));
    }
}
