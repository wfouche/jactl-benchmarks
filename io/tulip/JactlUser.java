package io.tulip;

import io.github.tulipltt.tulip.user.HttpUser;
import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.jactl.Jactl;
import groovy.util.Eval;
import com.ezylang.evalex.Expression;
import org.python.util.PythonInterpreter;

public class JactlUser extends HttpUser {

    PythonInterpreter jython = new PythonInterpreter();

    public boolean onStart() {
        // Initialize the shared RestClient object only once
        if (getUserId() == 0) {
            logger.info("Java");
            super.onStart();
        }
        return true;
    }

    // Action 1
    public boolean action1() {
        var result = Jactl.eval("3 + 4");
        return true;
    }

    // Action 2
    public boolean action2() {
        var result = Eval.me("3 + 4");
        return true;
    }

    // Action 3
    public boolean action3() {
        var result = jython.eval("3 + 4");
        return true;
    }

    // Action 4
    public boolean action4() {
        try {
            var result = (new Expression("3 + 4")).evaluate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean onStop() {
        return true;
    }

    public Logger logger() {
        return logger;
    }

    // Logger
    private static final Logger logger = LoggerFactory.getLogger(JactlUser.class);

}
