package com.example.mdp_android.main;

import org.json.JSONException;

public interface ObstacleDialogListener {
    void onObstacleDataSubmitted(String obstacleId, String row, String col, String direction) throws JSONException;
}