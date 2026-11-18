public class answerkeysaexam { //ito ung class
    public static void main(String[] args) { //Dito mag sisimula lahat mehn


                // Ito yung tamang sagot sa bawat question.
                char[] answerKey = {
                        'A', 'C', 'B', 'D', 'A',
                        'C', 'C', 'B', 'A', 'D'
                };

                // Ito naman yung mga sagot na binigay ng student.
                char[] studentAnswers = {
                        'A', 'B', 'B', 'D', 'C',
                        'C', 'C', 'B', 'A', 'A'
                };

                // Dito natin bibilangin kung ilan yung tamang sagot, kaya 0 muna.
                int correctCount = 0;

                // Iche-check ng loop lahat ng sagot ng student gamit yung answer key.
                for (int i = 0; i < answerKey.length; i++) {

                    // Kapag pareho yung sagot ng student at answer key, dagdagan yung score.
                    if (studentAnswers[i] == answerKey[i]) {
                        correctCount++;

                    } else {

                        // Kapag mali, ipapakita kung anong question at kung ano yung tamang sagot.
                        System.out.println(
                                "Question " + (i + 1) +
                                        ": Incorrect. You answered '" +
                                        studentAnswers[i] +
                                        "', correct answer is '" +
                                        answerKey[i] + "'"
                        );
                    }
                }

                // Kinukuha natin yung percentage ng score base sa total questions.
                // Ginawang double para hindi mawala yung decimal kapag nag divide.
                double scorePercentage =
                        ((double) correctCount / answerKey.length) * 100;

                System.out.println("\nCorrect Answers: " +
                        correctCount + "/" + answerKey.length);

                System.out.println("Score: " + scorePercentage + "%");

                // Kapag 70 pataas yung score, pasado. Kung mas mababa, bagsak.
                if (scorePercentage >= 70.0) {
                    System.out.println("Result: PASS");
                } else {
                    System.out.println("Result: FAIL");
                }
            }
        }


