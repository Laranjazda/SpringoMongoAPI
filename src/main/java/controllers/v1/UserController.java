package controllers.v1;

import controllers.AbstractUserController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/")
public class UserController extends AbstractUserController {
}
