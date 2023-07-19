node {
    // define the email content
    def emailContent = '''
        <html>
            <head>
                <style>
                    table {
                        border-collapse: collapse;
                        width: 100%;
                    }
                    th, td {
                        padding: 8px;
                        text-align: left;
                        border-bottom: 1px solid #ddd;
                    }
                    th {
                        background-color: #4CAF50;
                        color: white;
                    }
                    tr:nth-child(even) {
                        background-color: #f2f2f2;
                    }
                </style>
            </head>
            <body>
                <h1>HTML Email Example</h1>
                <p>This is an example of a complex HTML email.</p>
                <table>
                    <tr>
                        <th>Column 1</th>
                        <th>Column 2</th>
                        <th>Column 3</th>
                    </tr>
                    <tr>
                        <td>Row 1, Column 1</td>
                        <td>Row 1, Column 2</td>
                        <td>Row 1, Column 3</td>
                    </tr>
                    <tr>
                        <td>Row 2, Column 1</td>
                        <td>Row 2, Column 2</td>
                        <td>Row 2, Column 3</td>
                    </tr>
                </table>
            </body>
        </html>
    '''

    // send an email using emailext plugin
    emailext (
        subject: 'HTML Email Example',
        body: emailContent,
        mimeType: 'text/html',
        to: 'recipient@example.com',
        cc: 'ccrecipient@example.com',
        bcc: 'bccrecipient@example.com',
        replyTo: 'sender@example.com',
        attachmentsPattern: '/path/to/attachments/*.txt',
        compressAttachments: true
    )
}
