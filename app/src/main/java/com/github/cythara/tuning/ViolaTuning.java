package com.github.cythara.tuning;

import com.github.cythara.NoteName;
import com.github.cythara.Tuning;

import static com.github.cythara.NoteName.*;

public class ViolaTuning implements Tuning {

    private enum Pitch implements com.github.cythara.Note {

        C3(C, 3, 130.813f),
        G3(G, 3, 195.998f),
        D4(D, 4, 293.665f),
        A4(A, 4, 440.000f);

        private NoteName name;
        private final String sign;
        private final int octave;
        private final float frequency;

        Pitch(NoteName name, int octave, float frequency) {
            this.name = name;
            this.octave = octave;
            this.sign = "";
            this.frequency = frequency;
        }

        public NoteName getName() {
            return name;
        }

        public float getFrequency() {
            return frequency;
        }

        @Override
        public int getOctave() {
            return octave;
        }

        @Override
        public String getSign() {
            return sign;
        }
    }

    @Override
    public com.github.cythara.Note[] getNotes() {
        return Pitch.values();
    }

    @Override
    public com.github.cythara.Note findNote(String name) {
        return Pitch.valueOf(name);
    }
}
