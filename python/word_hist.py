import string
import random

def process_file(filename):
    hist = dict()
    fp = open(filename)
    for line in fp:
        process_line(line, hist)
    return hist


def process_line(line, hist):
    line = line.replace('_', ' ')
    for word in line.split():
        word = word.strip(string.punctuation + string.whitespace)
        word = word.lower()
        hist[word]  = hist.get(word, 0) + 1

def total_words(hist):
    return sum(hist.values())


def different_words(hist):
    return len(hist)

def most_common_words(hist):
    common_words = []
    for key, value in hist.items():
        common_words.append((value, key))

    common_words.sort(reverse=True)
    return common_words

def subtract(dict1, dict2):
    result = dict1
    for key in dict1:
        if key not in dict2:
            result[key] = None
    return result

def random_word(dict):
   words = []
   for word, frequency in dict.items():
       words.extend([word] * frequency)
   return random.choice(words)


hist = process_file('emma.txt')

print(hist)
print(total_words(hist))
print(different_words(hist))

for frequency, word in most_common_words(hist)[:10]:
    print(word, frequency, sep='\t')


words = process_file('words.txt')

different_words = subtract(hist, words)

for word in different_words:
    print(word)

print(random_word(process_file('emma.txt')))
