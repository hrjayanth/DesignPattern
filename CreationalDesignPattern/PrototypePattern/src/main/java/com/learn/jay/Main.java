package com.learn.jay;

import com.learn.jay.pojo.Circle;
import com.learn.jay.pojo.Rectangle;
import com.learn.jay.pojo.Shape;

import lombok.extern.slf4j.Slf4j;

/**
 * Main — entry point to run and test the Prototype Pattern.
 *
 * Demonstrates:
 * 1. Cloning shapes from a registry
 * 2. Clones are independent — mutating a clone does NOT affect the original
 * 3. Direct object-level cloning without a registry
 */
@Slf4j
public class Main {

    public static void main(String[] args) {

        separator("Prototype Pattern Demo");

        // ── Demo 1: Clone from the Shape Registry ─────────────────────────
        separator("1. Cloning from ShapeRegistry");

        ShapeRegistry registry = new ShapeRegistry();

        Circle c1 = (Circle) registry.getClone("red-circle");
        Rectangle r1 = (Rectangle) registry.getClone("blue-rectangle");
        Circle c2 = (Circle) registry.getClone("green-circle");

        log.info("Cloned shapes (original positions):");
        c1.draw();
        r1.draw();
        c2.draw();

        // ── Demo 2: Mutate clones — originals in registry stay unchanged ──
        separator("2. Mutating clones (registry prototypes should be unaffected)");

        c1.setX(100);
        c1.setY(200);
        c1.setColor("Pink");

        r1.setX(300);
        r1.setY(150);
        r1.setWidth(200);

        log.info("After mutation:");
        c1.draw();
        r1.draw();

        log.info("Registry prototype still intact (get a fresh clone):");
        registry.getClone("red-circle").draw();
        registry.getClone("blue-rectangle").draw();

        // ── Demo 3: Direct cloning without a registry ─────────────────────
        separator("3. Direct cloning — copy then customise");

        Circle original = new Circle("Orange", 40, 10, 10);
        log.info("Original:");
        original.draw();

        Circle cloneA = (Circle) original.clone();
        cloneA.setColor("Purple");
        cloneA.setRadius(80);

        Circle cloneB = (Circle) original.clone();
        cloneB.setX(500);
        cloneB.setY(500);

        log.info("Clone A (colour & radius changed):");
        cloneA.draw();
        log.info("Clone B (position changed):");
        cloneB.draw();
        log.info("Original unchanged:");
        original.draw();

        // ── Demo 4: Verify clones are different objects ───────────────────
        separator("4. Identity check — clone != original");

        Circle proto = new Circle("Yellow", 20, 0, 0);
        Circle cloned = (Circle) proto.clone();

        log.info("  proto  == cloned  : " + (proto == cloned)); // false — different objects
        log.info("  proto.equals(cloned): " + proto.equals(cloned)); // true — Lombok @Data uses field-based
        log.info("  Same type? " + proto.getType().equals(cloned.getType())); // true

        separator("Done");
    }

    private static void separator(String title) {
        log.info("═".repeat(55));
        log.info("  " + title);
        log.info("═".repeat(55));
    }
}
