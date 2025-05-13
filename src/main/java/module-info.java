module com.assignment.tictactoe.tictactoece {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assignment.tictactoe.tictactoece to javafx.fxml;
    exports com.assignment.tictactoe.tictactoece;
}