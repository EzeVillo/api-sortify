package com.villo.sortify.service.implementation;

import com.villo.sortify.converter.toDto.PlayListConverterToDTO;
import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.dto.response.TrackPlayListResponseDTO;
import com.villo.sortify.integration.SpotifyApiClient;
import com.villo.sortify.service.PlayListService;
import com.villo.sortify.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayListServiceImpl implements PlayListService {
    final private SpotifyApiClient spotifyApiClient;
    final private PlayListConverterToDTO playListConverterToDTO;
    final private UserService userService;

    @Override
    public PlayListResponseDTO getPlayListsFromLoggedUser(final String auth) {
        return this.playListConverterToDTO.playListResponseFromPlayListResponseSTO(this.spotifyApiClient.getPlayListsFromLoggedUser(auth, userService.getInfoFromLoggedUser(auth).getId()));
    }

    @Override
    public TrackPlayListResponseDTO getTracksFromPlayList(final String auth, final String playListId) {
        return this.playListConverterToDTO.trackPlayListResponseFromTrackPlayListResponseDTO(this.spotifyApiClient.getTracksFromPlayList(auth, playListId));
    }
}
