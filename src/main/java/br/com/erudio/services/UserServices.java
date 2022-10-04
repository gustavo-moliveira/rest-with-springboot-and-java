//package br.com.erudio.services;
//
//import br.com.erudio.controllers.PersonController;
//import br.com.erudio.data.vo.v1.PersonVO;
//import br.com.erudio.exceptions.ResourceNotFoundException;
//import br.com.erudio.mapper.DozerMapper;
//import br.com.erudio.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.logging.Logger;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
//
//@Service
//public class UserServices implements UserDetailsService {
//
//	private Logger logger = Logger.getLogger(UserServices.class.getName());
//
//	@Autowired
//	UserRepository personRepository;
//
//	public UserServices(UserRepository personRepository) {
//		this.personRepository = personRepository;
//	}
//
//	public PersonVO findById(Long id) {
//
//		logger.info("Finding one person!");
//
//		var entity = personRepository.findById(id)
//			.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
//		var vo = DozerMapper.parseObject(entity, PersonVO.class);
//		vo.add(linkTo(methodOn(PersonController.class).findById(id)).withSelfRel());
//		return vo;
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		logger.info("Finding one user by name "+username + "!");
//		var user = personRepository.findByUsername(username);
//		if (user != null) {
//			return user;
//		} else {
//			throw new UsernameNotFoundException("Username " + username + "not found!");
//		}
//	}
//}
