package com.villo.sortify.service.implementation;

import com.villo.sortify.converter.toDto.UserConverterToDTO;
import com.villo.sortify.dto.response.UserInfoResponseDTO;
import com.villo.sortify.integration.SpotifyApiClient;
import com.villo.sortify.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final SpotifyApiClient spotifyApiClient;
    private final UserConverterToDTO userConverterToDTO;

    public UserInfoResponseDTO getInfoFromLoggedUser(final String auth) {
        return this.userConverterToDTO.userInfoResponseFromUserInfoResponseSTO(this.spotifyApiClient.getInfoFromLoggedUser(auth));
    }
}
