package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PrjMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PrjMstr
 * @author MyEclipse Persistence Tools
 */

public class PrjMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PrjMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PrjMstr transientInstance) {
		log.debug("saving PrjMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PrjMstr persistentInstance) {
		log.debug("deleting PrjMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PrjMstr findById(com.gopawpaw.erp.hibernate.p.PrjMstrId id) {
		log.debug("getting PrjMstr instance with id: " + id);
		try {
			PrjMstr instance = (PrjMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PrjMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PrjMstr instance) {
		log.debug("finding PrjMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PrjMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PrjMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PrjMstr instances");
		try {
			String queryString = "from PrjMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PrjMstr merge(PrjMstr detachedInstance) {
		log.debug("merging PrjMstr instance");
		try {
			PrjMstr result = (PrjMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PrjMstr instance) {
		log.debug("attaching dirty PrjMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PrjMstr instance) {
		log.debug("attaching clean PrjMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PrjMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PrjMstrDAO) ctx.getBean("PrjMstrDAO");
	}
}