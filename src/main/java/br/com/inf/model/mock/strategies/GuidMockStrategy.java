package br.com.inf.model.mock.strategies;

import uk.co.jemos.podam.common.AttributeStrategy;

import java.util.UUID;

/**
 * Estratégia de geração de uuids.
 */
public class GuidMockStrategy implements AttributeStrategy<String> {

    /**
     * <p>Retorna um uuid random.</p>
     * {@inheritDoc}
     */
    @Override
    public String getValue() {
        return UUID.randomUUID().toString();
    }
}
