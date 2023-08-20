package com.villo.sortify.service;

import com.villo.sortify.dto.response.PlayListResponseDTO;

import java.util.List;

public interface PlayListService {
    public List<PlayListResponseDTO> getPlayListsFromLoggedUser(final String auth);
}
