package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class HelloTest {
  private static final Hello hello = new Hello();

  @Mock
  private Person person;

  @Test
  public void should_say_hello() {
    hello.say(person);

    verify(person).hear("Hello");
  }
}
