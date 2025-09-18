
#include <string>

int main() {
    std::string str = "AaBbCcDd";
    std::string uppercase, lowercase;
    for (size_t i = 0; i < str.size(); ++i) {
        if (i % 2 == 0)
            uppercase += str[i];
        else
            lowercase += str[i];
    }
    std::cout << "Заглавные: " << uppercase << std::endl;
    std::cout << "Строчные: " << lowercase << std::endl;
    return 0;
}