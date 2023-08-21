package com.villo.sortify.service;

import com.villo.sortify.dto.response.UserInfoResponseDTO;

public interface UserService {
    UserInfoResponseDTO getInfoFromLoggedUser(String auth);
}
