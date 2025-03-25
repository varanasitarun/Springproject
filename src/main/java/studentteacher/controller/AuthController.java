//package studentteacher.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.web.bind.annotation.*;
//import studentteacher.dto.AuthRequest;
//import studentteacher.dto.AuthResponse;
//import studentteacher.service.JwtUtil;
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @PostMapping("/login")
//    public Object login(@RequestBody AuthRequest request) {
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
//            );
//
//            final UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
//            final String jwt = jwtUtil.generateToken(userDetails.getUsername());
//
//            return new AuthResponse(jwt);
//        } catch (Exception e) {
//            return "Error: Unauthorized"; // Return 401 Unauthorized
//        }
//    }
//}
