package com.ldd.demoApp.utils.convert;

import com.ldd.demoApp.dto.UserDTO;
import com.ldd.demoApp.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserConvert {
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserDTO convert(User user);

    List<UserDTO> convertUserList(List<User> users);
}
