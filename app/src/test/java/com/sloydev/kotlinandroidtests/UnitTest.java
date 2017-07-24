package com.sloydev.kotlinandroidtests;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static java.util.Arrays.asList;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class UnitTest {

  @Mock
  UserRepository userRepository;

  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void unit_test_works() throws Exception {
    given(userRepository.getUsers()).willReturn(asList("a", "b"));

    List<String> users = userRepository.getUsers();

    verify(userRepository).getUsers();
  }
}