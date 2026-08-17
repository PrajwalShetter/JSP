<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>TaskWeaver - Agile Project Boards</title>
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
            color: #4a5568; /* Slate Blue Accent */
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

        /* Centralized Main Banner */
        .hero-banner {
            max-width: 800px;
            margin: 60px auto 40px auto;
            padding: 0 20px;
            text-align: center;
        }
        .hero-banner h1 {
            font-size: 34px;
            font-weight: bold;
            line-height: 1.2;
            margin: 0 0 20px 0;
        }
        .hero-banner p {
            font-size: 16px;
            line-height: 1.6;
            color: #444444;
            margin: 0 0 35px 0;
        }

        /* Input Form Block */
        .board-form {
            margin-bottom: 50px;
        }
        .board-form input[type="text"] {
            width: 320px;
            padding: 12px;
            border: 1px solid #999999;
            border-radius: 4px;
            font-size: 14px;
            margin-right: 8px;
            outline: none;
        }
        .board-form button {
            background-color: #4a5568;
            color: #ffffff;
            border: none;
            padding: 13px 24px;
            border-radius: 4px;
            font-size: 14px;
            font-weight: bold;
            cursor: pointer;
        }
        .board-form button:hover {
            background-color: #2d3748;
        }

        /* Horizontal Column Card Layout Row */
        .board-row {
            max-width: 1100px;
            margin: 0 auto 60px auto;
            padding: 0 20px;
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 25px;
        }
        .kanban-column {
            border: 1px solid #e2e8f0;
            border-radius: 6px;
            padding: 20px;
            background-color: #f7fafc;
            text-align: left;
        }
        .column-header {
            font-size: 14px;
            font-weight: bold;
            color: #4a5568;
            border-bottom: 2px solid #e2e8f0;
            padding-bottom: 8px;
            margin: 0 0 15px 0;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }
        .task-card-mock {
            background-color: #ffffff;
            border: 1px solid #e2e8f0;
            border-radius: 4px;
            padding: 12px;
            margin-bottom: 12px;
            font-size: 13px;
            line-height: 1.4;
            color: #2d3748;
        }
        .task-card-mock:last-child {
            margin-bottom: 0;
        }
    </style>
</head>
<body>

    <!-- Top Navigation Header -->
    <header>
        <div class="brand">
            <img src="images/task-logo.jpeg" alt="TaskWeaver Logo">
            <span>TaskWeaver</span>
        </div>
        <div class="nav-links">
            <a href="boards.jsp">My Boards</a>
            <a href="teams.jsp">Manage Team</a>
            <a href="login.jsp" style="font-weight: bold; color: #4a5568;">User Login</a>
        </div>
    </header>

    <!-- Main Centralized Banner -->
    <div class="hero-banner">
        <h1>Organize your team items into flexible sprint boards.</h1>
        <p>TaskWeaver coordinates development timelines, pending bug trackers, and daily progress logs. Input an active project workspace key below to open your team's live task stream.</p>

        <!-- Search Input Form Container -->
        <div class="board-form">
            <form action="project_board.jsp" method="GET">
                <input type="text" name="boardKey" placeholder="Enter Project Board Key (e.g., PROJ-2026)" required>
                <button type="submit">Open Board</button>
            </form>
        </div>
    </div>

    <!-- Simulated Horizontal Kanban Board Workflow -->
    <div class="board-row">

        <!-- Backlog / To Do Column -->
        <div class="kanban-column">
            <p class="column-header">Backlog Items</p>
            <div class="task-card-mock">Fix database connection timeout error on local Tomcat instance.</div>
            <div class="task-card-mock">Map project image source file attributes dynamically inside web.xml.</div>
        </div>

        <!-- In Progress Column -->
        <div class="kanban-column">
            <p class="column-header">In Progress</p>
            <div class="task-card-mock">Design a clean, static index page layout structure for TaskWeaver routing system.</div>
        </div>

        <!-- Review / Done Column -->
        <div class="kanban-column">
            <p class="column-header">Completed</p>
            <div class="task-card-mock">Setup core folder structure requirements inside root deployment directory.</div>
        </div>

    </div>

</body>
</html>
