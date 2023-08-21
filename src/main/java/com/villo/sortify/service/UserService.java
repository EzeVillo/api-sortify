package com.villo.sortify.service;

import com.villo.sortify.dto.response.UserInfoResponseDTO;
import com.villo.sortify.sto.response.UserInfoResponseSTO;

public interface UserService {
    public UserInfoResponseDTO getInfoFromLoggedUser(String auth);
}
