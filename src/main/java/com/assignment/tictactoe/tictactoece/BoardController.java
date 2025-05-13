package com.assignment.tictactoe.tictactoece;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DialogEvent;
import javafx.scene.layout.GridPane;

public class BoardController implements BoardUI {

    @FXML
    private GridPane MainGrid;

    @FXML
    private Button button00;

    @FXML
    private Button button01;

    @FXML
    private Button button02;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    BoardImpl board;
    HumanPlayer human;
    AiPlayer aiPlayer;

    public BoardController(){
        board = new BoardImpl();
        human = new HumanPlayer(board);
        aiPlayer = new AiPlayer(board);

        board.initializeBoard();
    }

    @FXML
    void onclickGridBtn(ActionEvent event) {
        Button button = (Button) event.getSource();
        String buttonId = button.getId();
        int row = -1;
        int column = -1;

        switch (buttonId) {
            case "button00": row = 0; column = 0; break;
            case "button01": row = 0; column = 1; break;
            case "button02": row = 0; column = 2; break;
            case "button10": row = 1; column = 0; break;
            case "button11": row = 1; column = 1; break;
            case "button12": row = 1; column = 2; break;
            case "button20": row = 2; column = 0; break;
            case "button21": row = 2; column = 1; break;
            case "button22": row = 2; column = 2; break;
        }

        if (board.isLegalMove(row, column)) {
            human.move(row, column);
            updateUI();

            if (board.checkWinner() != null) {
                showAlert("You Win");
                disableButtons();
            } else if (board.isFull()) {
                showAlert("Draw");
            } else {
                aiPlayer.findBestMove();
                updateUI();
                if (board.checkWinner() != null) {
                    showAlert("AI Wins");
                }
            }
        } else {
            showAlert("Invalid Move");
        }
    }

    private void disableButtons() {
        button00.setDisable(true);
        button01.setDisable(true);
        button02.setDisable(true);
        button10.setDisable(true);
        button11.setDisable(true);
        button12.setDisable(true);
        button20.setDisable(true);
        button21.setDisable(true);
        button22.setDisable(true);
    }

    private void updateUI() {
        for (int i = 0; i < board.getPieces().length; i++) {
            for (int j = 0; j < board.getPieces()[i].length; j++) {
                Piece piece = board.getPieces()[i][j];
                if (piece != null) {
                    updateBoard(i, j, piece);
                } else {
                    updateBoard(i, j, Piece.EMPTY);
                }
            }
        }
    }

    @Override
    public void updateBoard(int row, int column, Piece piece) {
        String pieces = (piece != null) ? piece.toString() : "";

        if (row == 0 && column == 0) button00.setText(pieces);
        else if (row == 0 && column == 1) button01.setText(pieces);
        else if (row == 0 && column == 2) button02.setText(pieces);
        else if (row == 1 && column == 0) button10.setText(pieces);
        else if (row == 1 && column == 1) button11.setText(pieces);
        else if (row == 1 && column == 2) button12.setText(pieces);
        else if (row == 2 && column == 0) button20.setText(pieces);
        else if (row == 2 && column == 1) button21.setText(pieces);
        else if (row == 2 && column == 2) button22.setText(pieces);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.setOnCloseRequest((DialogEvent event) -> {
            board.initializeBoard();
            updateUI();
        });
        alert.showAndWait();
    }
}
