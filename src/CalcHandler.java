import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CalcHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String query = exchange.getRequestURI().getQuery();
        Map<String, String> params = getParameters(query);

        int numberOne = Integer.parseInt(params.get("numberOne"));
        int numberTwo = Integer.parseInt(params.get("numberTwo"));

        String operation = params.get("operation");

        String message;
        int result;

        switch (operation) {
            case "add":
                result = numberOne + numberTwo;
                message = "Result = %s".formatted(result);
                break;
            case "sub":
                result = numberOne - numberTwo;
                message = "Result = %s".formatted(result);
                break;
            case "mul":
                result = numberOne * numberTwo;
                message = "Result = %s".formatted(result);
                break;
            case "div":
                result = numberOne / numberTwo;
                message = "Result = %s".formatted(result);
                break;
            default:
                message = "Unknown operation";
                break;
        }
        exchange.sendResponseHeaders(200, message.length());

        exchange.getResponseBody().write(message.getBytes());

        exchange.getResponseBody().close();
    }

    public Map<String, String> getParameters(String query) {
        Map<String, String> greetings = new HashMap<>();
        System.out.println(query);
        String[] split = query.split("&");
        for (String s : split) {
            String[] split1 = s.split("=");
            greetings.put(split1[0], split1[1]);
        }
        return greetings;
    }
}

