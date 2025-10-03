#include <iostream>
#include <vector>
#include <string>

int main() {
    std::vector<std::string> list = {"a", "1", "b", "2", "c", "3"};
    std::vector<std::string> letters, numbers;

    for (size_t i = 0; i < list.size(); ++i) {
        if (i % 2 == 0)
            letters.push_back(list[i]);
        else
            numbers.push_back(list[i]);
    }

    std::cout << "Буквы: ";
    for (const auto& ch : letters) std::cout << ch << " ";
    std::cout << "\nЧисла: ";
    for (const auto& num : numbers
