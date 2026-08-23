<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FinTrack - Personal Expense Ledger</title>
    <style>
        /* Plain Layout Construction */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #ffffff;
            color: #111111;
        }

        /* Top Header Navbar */
        header {
            background-color: #ffffff;
            padding: 20px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #dddddd;
        }
        .brand {
            display: flex;
            align-items: center;
        }
        .brand img {
            width: 26px;
            height: 26px;
            margin-right: 10px;
        }
        .brand span {
            font-size: 20px;
            font-weight: bold;
            color: #2f855a; /* Emerald Green Financial Accent */
        }
        .nav-links a {
            color: #555555;
            text-decoration: none;
            margin-left: 20px;
            font-size: 14px;
        }
        .nav-links a:hover {
            color: #000000;
            text-decoration: underline;
        }

        /* Main Split Container Layout */
        .split-layout {
            max-width: 1150px;
            margin: 50px auto;
            padding: 0 30px;
            display: flex;
            gap: 50px;
            align-items: flex-start;
        }

        /* Left Hand Information Column */
        .form-column {
            flex: 1;
            padding-top: 10px;
        }
        .form-column h1 {
            font-size: 32px;
            font-weight: bold;
            line-height: 1.3;
            margin: 0 0 15px 0;
        }
        .form-column p {
            font-size: 15px;
            line-height: 1.6;
            color: #444444;
            margin: 0 0 30px 0;
        }

        /* Input Form Elements */
        .budget-form input[type="text"] {
            width: 260px;
            padding: 12px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
            outline: none;
        }
        .budget-form button {
            background-color: #2f855a;
            color: #ffffff;
            border: none;
            padding: 13px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .budget-form button:hover {
            background-color: #226442;
        }

        /* Right Hand Transaction Table Column */
        .table-column {
            flex: 1.2;
            border: 1px solid #e2e8f0;
            border-radius: 6px;
            padding: 20px;
            background-color: #fcfcfc;
        }
        .table-column h3 {
            font-size: 16px;
            font-weight: bold;
            color: #2f855a;
            margin: 0 0 15px 0;
            border-bottom: 1px solid #e2e8f0;
            padding-bottom: 8px;
        }

        /* Simple Financial Ledger Data Layout */
        .ledger-table {
            width: 100%;
            border-collapse: collapse;
            font-size: 14px;
            text-align: left;
        }
        .ledger-table th {
            color: #718096;
            font-weight: bold;
            padding: 8px 4px;
            border-bottom: 1px solid #e2e8f0;
        }
        .ledger-table td {
            padding: 12px 4px;
            border-bottom: 1px dashed #e2e8f0;
        }
        .ledger-table tr:last-child td {
            border-bottom: none;
        }
        .amt-negative {
            color: #c53030;
            font-weight: bold;
        }
        .amt-positive {
            color: #2f855a;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="/images/fin-logo.webp" alt="FinTrack Logo">
            <span>FinTrack</span>
        </div>
        <div class="nav-links">
            <a href="budgets.jsp">Budget Plans</a>
            <a href="getUser.jsp">User Profile</a>
            <a href="signUp.jsp" style="font-weight: bold; color: #2f855a;">signUp</a>
        </div>
    </header>

    <!-- Main Content Split Grid -->
    <div class="split-layout">

        <!-- Left Structural Column - Text and Action Form -->
        <div class="form-column">
            <h1>Take total control of your cash flow.</h1>
            <p>FinTrack serves as a clean individual budget register. It catalogs transaction line items, monitors recurring bills, and breaks down saving percentages automatically. Input your target month label below to open an active ledger sheet.</p>

            <div class="budget-form">
                <form action="monthly_ledger.jsp" method="GET">
                    <input type="text" name="monthYear" placeholder="Enter Month & Year (e.g., August 2026)" required>
                    <button type="submit">Open Ledger</button>
                </form>
            </div>
        </div>

        <!-- Right Structural Column - Mock Ledger Statement Preview -->
        <div class="table-column">
            <h3>Recent Statement Summary</h3>

            <table class="ledger-table">
                <thead>
                    <tr>
                        <th>Date</th>
                        <th>Category</th>
                        <th>Amount</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>12-Aug-2026</td>
                        <td>Office Internet Bill</td>
                        <td class="amt-negative">- ₹1,499.00</td>
                    </tr>
                    <tr>
                        <td>10-Aug-2026</td>
                        <td>Freelance Milestone Payout</td>
                        <td class="amt-positive">+ ₹35,000.00</td>
                    </tr>
                    <tr>
                        <td>08-Aug-2026</td>
                        <td>Server Subscription Fee</td>
                        <td class="amt-negative">- ₹850.00</td>
                    </tr>
                    <tr>
                        <td>05-Aug-2026</td>
                        <td>Books & Training Course</td>
                        <td class="amt-negative">- ₹2,200.00</td>
                    </tr>
                </tbody>
            </table>
        </div>

    </div>

</body>
</html>
