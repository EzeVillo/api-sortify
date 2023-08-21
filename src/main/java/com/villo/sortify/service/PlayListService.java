package com.villo.sortify.service;

import com.villo.sortify.dto.response.PlayListResponseDTO;

public interface PlayListService {
    public PlayListResponseDTO getPlayListsFromLoggedUser(final String auth);
}
