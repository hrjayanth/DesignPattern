package com.learn.jay;

import java.util.HashMap;
import java.util.Map;

import com.learn.jay.pojo.Circle;
import com.learn.jay.pojo.Rectangle;
import com.learn.jay.pojo.Shape;

import lombok.extern.slf4j.Slf4j;

/**
 * Shape Registry / Cache — acts as the Client in the Prototype pattern.
 *
 * Pre-loads a set of prototype shapes. When a shape is requested,
 * it returns a CLONE of the stored prototype — not the original.
 * This avoids expensive re-creation and keeps prototypes safe from mutation.
 */
@Slf4j
public class ShapeRegistry {

    private final Map<String, Shape> registry = new HashMap<>();

    public ShapeRegistry() {
        // Pre-load prototypes into the registry
        registry.put("red-circle", new Circle("Red", 50, 0, 0));
        registry.put("blue-rectangle", new Rectangle("Blue", 100, 60, 0, 0));
        registry.put("green-circle", new Circle("Green", 30, 0, 0));
    }

    /**
     * Returns a CLONE of the requested prototype.
     * The caller can safely mutate the clone without affecting the registry.
     *
     * @param key the prototype identifier
     * @return a fresh clone of the prototype, or null if not found
     */
    public Shape getClone(String key) {
        Shape prototype = registry.get(key);
        if (prototype == null) {
            log.warn("  [WARN] No prototype found for key: " + key);
            return null;
        }
        return prototype.clone();
    }
}
