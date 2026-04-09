import os

try:
    from pypdf import PdfReader
except ImportError:
    import sys
    import subprocess
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pypdf"])
    from pypdf import PdfReader

pdf_files = [f for f in os.listdir('.') if f.endswith('.pdf')]
for pdf_file in pdf_files:
    reader = PdfReader(pdf_file)
    text = ""
    for page in reader.pages:
        text += page.extract_text() + "\n"
    with open(pdf_file.replace('.pdf', '.txt'), 'w', encoding='utf-8') as f:
        f.write(text)
    print(f"Extracted {pdf_file}")
