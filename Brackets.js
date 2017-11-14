function solution(s) {
    // write your code in JavaScript (Node.js 6.4.0)
    if(s.length == 0) return 1;
        var stack = [];
        for(var i = 0; i < s.length; i++) {
            if((s[i] == ')' && stack.length == 0)  ||
                    (s[i] == ']' && stack.length == 0) ||
                    (s[i] == '}' && stack.length == 0)) {
                return 0;
            }
            if(s[i] == '(' || s[i] == '[' || s[i] == '{')
                stack.push(s[i]);
            else if(s[i] == ')' && stack[stack.length - 1] ==  '(') {
                stack.pop();
            } else if(s[i] == ']' && stack[stack.length - 1] == '[') {
                stack.pop();
            } else if(s[i] == '}' && stack[stack.length - 1] == '{') {
                stack.pop();
            }
        }
        if(stack.length == 0) return 1;
        else return 0;
}
