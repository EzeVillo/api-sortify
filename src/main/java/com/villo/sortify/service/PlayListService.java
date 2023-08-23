package com.villo.sortify.service;

import com.villo.sortify.dto.response.PlayListResponseDTO;
import com.villo.sortify.dto.response.TrackPlayListResponseDTO;

public interface PlayListService {
    PlayListResponseDTO getPlayListsFromLoggedUser(final String auth);
    TrackPlayListResponseDTO getTracksFromPlayList(final String auth, final String playListId);
}
