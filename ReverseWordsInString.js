function ReverseWords(str) {
    var words = [];
    var word = "";
    for(var i = 0; i < str.length; i++) {
        if(i == str.length - 1) {
            word += str[i];
            words.push(word);
        }
        else if(str.charAt(i) == ' ') {
            words.push(word);
            word = "";
        }
        else {
            word += str[i];
        }
    }
    words.reverse();
    for(var i = 0; i < words.length; i++) {
        print(words[i]);
    }
}

function ReverseWordsOnePass(str) {
    var words = str.split(" ");
    for(var i = words.length - 1; i >= 0; i--) {
        print(words[i]);
    }
}

ReverseWordsOnePass("The brown fox jumped over the grey wall");
ReverseWords("The brown fox jumped over the grey wall");
