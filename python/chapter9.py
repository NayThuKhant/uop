def has_no_e(string):
   return not 'e' in string

totalWords = 0
numberOfNoEWords = 0

fin = open('words.txt')
for line in fin:
    totalWords = totalWords + 1

    if has_no_e(line):
        numberOfNoEWords = numberOfNoEWords + 1
        print(line.strip())

print('Percentage of words in the list that has no e - ' + str((numberOfNoEWords / totalWords) * 100) + ' %')



