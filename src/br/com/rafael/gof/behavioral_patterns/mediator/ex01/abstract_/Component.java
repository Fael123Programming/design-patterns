package br.com.rafael.gof.behavioral_patterns.mediator.ex01.abstract_;

public interface Component {
    int ADD_BUTTON = 1, DELETE_BUTTON = 2, SAVE_BUTTON = 3, FILTER = 4, NOTE_LIST = 5, TEXT_BOX = 6, TITLE = 7;

    void setMediator(Mediator mediator);

    int getType(); //One of the types listed above.
}
