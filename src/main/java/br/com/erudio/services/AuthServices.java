//package br.com.erudio.services;
//
//import br.com.erudio.data.vo.v2.AccountCrendentialsVO;
//import br.com.erudio.data.vo.v2.TokenVO;
//import br.com.erudio.repositories.UserRepository;
//import br.com.erudio.security.jwt.JwtTokenProvider;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthServices {
//
//    @Autowired
//    JwtTokenProvider tokenProvider;
//
//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    @Autowired
//    UserRepository userRepository;
//
//    public ResponseEntity signin(AccountCrendentialsVO data) {
//        try {
//            var username = data.getUsername();
//            var password = data.getPassword();
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//
//            var user = userRepository.findByUsername(username);
//            var tokenResponse = new TokenVO();
//            if (user != null) {
//                tokenResponse = tokenProvider.createAcessToken(username, user.getRoles());
//            } else {
//                throw new UsernameNotFoundException("Username " + username + "not found!");
//            }
//            return ResponseEntity.ok(tokenResponse);
//        } catch (Exception e) {
//            throw new BadCredentialsException("Invalid username/password supplied!");
//        }
//    }
//
//}
