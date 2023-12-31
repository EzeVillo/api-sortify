package com.villo.sortify.converter.toDto;

import com.villo.sortify.dto.response.UserInfoResponseDTO;
import com.villo.sortify.sto.response.UserInfoResponseSTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverterToDTO {
    public UserInfoResponseDTO userInfoResponseFromUserInfoResponseSTO(final UserInfoResponseSTO userInfoResponseSTO) {
        return UserInfoResponseDTO.builder().id(userInfoResponseSTO.getId()).displayName(userInfoResponseSTO.getDisplayName()).build();
    }
}
