package poly.service;

import java.util.List;

import poly.dto.UserDTO;

public interface IUserService {

	UserDTO getUserInfo(UserDTO pDTO) throws Exception;

	List<UserDTO> getUserList(UserDTO uDTO);

}
