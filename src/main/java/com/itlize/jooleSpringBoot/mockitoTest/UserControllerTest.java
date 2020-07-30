package com.itlize.jooleSpringBoot.mockitoTest;


import com.itlize.jooleSpringBoot.controllers.UserController;
import com.itlize.jooleSpringBoot.entities.User;
import com.itlize.jooleSpringBoot.jwtUtils.JwtTokenProvider;
import com.itlize.jooleSpringBoot.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashMap;

import static org.mockito.Mockito.when;

@SpringBootTest
@Slf4j
public class UserControllerTest {

    private MockMvc mvc;

    @Mock(answer = Answers.RETURNS_SMART_NULLS)
    private UserService userService;

    @Mock
    private JwtTokenProvider provider = new JwtTokenProvider();

    @Mock
    private UsernamePasswordAuthenticationToken authenticationToken;

    @Spy
    User user = new User();


    @InjectMocks
    private UserController userController;

    @Before

    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mvc = MockMvcBuilders.standaloneSetup(userController).build();
    }


    @Test
    public void testLogin() throws Exception {
        user.setUsername("yaozhong");
        user.setPassword("123456");

        when(provider.generateToken(authenticationToken)).thenReturn("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ5YW96aG9uZyIsInJvbGVzIjoiVVNFUiIsImV4cCI6MTU5NjIxMjk5N30.Vy9Pl6bCPfUghPLwrqLTNBrvNt3GPmTtFi8iG_HBwPD8hsF5akfm8hUfc40FsZqBj2hAys2mV8gNrnmdjv9J8Q");
        user.setToken("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ5YW96aG9uZyIsInJvbGVzIjoiVVNFUiIsImV4cCI6MTU5NjIxMjk5N30.Vy9Pl6bCPfUghPLwrqLTNBrvNt3GPmTtFi8iG_HBwPD8hsF5akfm8hUfc40FsZqBj2hAys2mV8gNrnmdjv9J8Q");
        when(userService.findByUsername("yaozhong")).thenReturn(user);
        Assert.assertNotNull(user);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/users/login")
                .header("Authorization", "Basic eWFvemhvbmc6MTIzNDU=")
                .contentType("text/html")
                .accept(MediaType.APPLICATION_JSON);


        ResultActions perform = mvc.perform(request);

        perform.andExpect(MockMvcResultMatchers.status().isOk());

        MvcResult mvcResult = perform.andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();


    }


}
