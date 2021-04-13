package StockTradingAI;

import ib.controller.ApiController;

public class StockTradingAI {
//We need instances of our logger implementation
static LoggerImplementation inLogger = new LoggerImplementation();
static LoggerImplementation outLogger = new LoggerImplementation();
//We need an instance of our connection handler implementation
static ConnectionHandlerImplementation connectionHandler = new ConnectionHandlerImplementation();
//We need an instance of the ApiController
static ApiController apiController = new ApiController(connectionHandler, inLogger, outLogger);
    public static void main(String _[]){
        apiController.connect("localhost", 7497, 0);
    }
}


