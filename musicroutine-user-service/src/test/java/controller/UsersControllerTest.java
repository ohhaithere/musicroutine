package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.frostmaster.musicroutine.userservice.App;
import com.frostmaster.musicroutine.userservice.domain.model.entity.User;
import com.frostmaster.musicroutine.userservice.domain.service.UserDispatcher;
import com.frostmaster.musicroutine.userservice.domain.service.UserService;
import com.frostmaster.musicroutine.userservice.resources.UserContoller;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.UUID;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Igor_Usachev on 3/9/2017.
 */
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(classes={App.class})
public class UsersControllerTest {

    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserContoller userController;

    @InjectMocks
    UserDispatcher workUnitDispatcher;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(userController)
                .build();
    }

    @Test
    public void test_create_user_success() throws Exception {
        User user = new User("nigger", "faggot", "nigger@faggot.com");
        UUID uuid = UUID.randomUUID();
        user.setId(uuid);

        when(userService.exists(user)).thenReturn(false);
        doNothing().when(userService).add(user);

        mockMvc.perform(
                post("http://localhost:8080/v1/user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(user)))
                .andExpect(status().isOk());

//        verify(userService, times(1)).exists(user);
//        verify(userService, times(1)).add(user);
//        verifyNoMoreInteractions(userService);
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
